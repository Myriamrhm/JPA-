package net.simplon.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {
	
	@Autowired
	IPaysRepository pays;
	
	@Autowired
	IPersonneRepository personnes;

	@Test
	public void creerDesPersonnes() {
		Personne myriam = new Personne("Myriam","Rahmi");
		Personne hawa = new Personne("Hawa", "Nom");
		Personne gracia = new Personne("Gracia", "Nom");
		personnes.save(gracia);
				
	}
	
	@Test
	public void creerDesPays() {
		Pays france = new Pays("France");
		pays.save(france);
	}

}

