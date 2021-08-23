package uk.co.kineteck.jaxb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uk.co.kineteck.jaxb.model.Competitor;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootApplication
public class JaxbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JaxbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Competitor competitor = this.unMarshallingXML("competitor.xml");
		System.out.println(competitor);
	}

	private Competitor unMarshallingXML(String filename) throws JAXBException, FileNotFoundException {
		JAXBContext context = JAXBContext.newInstance(Competitor.class);
		ClassLoader classLoader = getClass().getClassLoader();
		InputStream is = classLoader.getResourceAsStream(filename);
		Competitor competitor = (Competitor) context.createUnmarshaller().unmarshal(is);
		return competitor;
	}
}
