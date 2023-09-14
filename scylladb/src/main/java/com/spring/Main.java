package com.spring;

import java.io.File;   

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Host;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.policies.DCAwareRoundRobinPolicy;

@Component
public class Main implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Main.run()");

		File bundleFile = new File("C:\\Users\\ctel\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\scylladb\\src\\main\\resources\\connect-bundle-HPCL.yaml");
		
//		File bundleFile = new ClassPathResource("C:\\Users\\ctel\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\scylladb\\src\\main\\resources\\connect-bundle-HPCL.yaml").getFile();

		Cluster cluster = Cluster.builder()
				.withLoadBalancingPolicy(DCAwareRoundRobinPolicy.builder().withLocalDc("us-east-1").build())
				.withScyllaCloudConnectionConfig(bundleFile).build();

		for (Host host : cluster.getMetadata().getAllHosts()) {
			System.out.printf("Datacenter: %s, Host: %s, Rack: %s\n", host.getDatacenter(), host.getEndPoint(),
					host.getRack());
		}

		Session session = cluster.connect();

		System.out.println("Connected to cluster " + cluster.getMetadata().getClusterName());
		ResultSet resultSet = session.execute("SELECT * FROM system.clients LIMIT 10");

		for (Row row : resultSet.all()) {
			System.out.println(row.toString());
		}

		session.close();
		cluster.close();
	}

}
