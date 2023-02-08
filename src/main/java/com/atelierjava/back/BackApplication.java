package com.atelierjava.back;

import com.atelierjava.back.Entity.*;
import com.atelierjava.back.Repository.*;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class BackApplication {

	@Autowired
	EventRepository eventRepository;

	@Autowired
	ArtistRepository artistRepository;

	@Autowired
	DiscountRepository discountRepository;

	@Autowired
	ProductRepository productRepository;


	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackApplication.class, args);
	}

	@PostConstruct
	public void init(){
		if(eventRepository.count() == 0){
			List<Artist> listeArtiste = new ArrayList<>();
			Date dateEvent = new Date(System.currentTimeMillis()+24*60*60*1000);
			Date dateEndEvent = new Date(System.currentTimeMillis()+48*60*60*1000);
			Date sellEvent = new Date(System.currentTimeMillis()-72*60*60*1000);
			eventRepository.save(Event.builder().name("Astroworld Tour!").place("Bercy").artist(listeArtiste).max_tickets(450).price(6500).start_at(dateEvent).end_at(dateEndEvent).sell_at(sellEvent).build());
			eventRepository.save(Event.builder().name("Goldman").place("Arkea arena").artist(listeArtiste).max_tickets(8730).price(6900).start_at(dateEvent).end_at(dateEndEvent).sell_at(sellEvent).build());
			eventRepository.save(Event.builder().name("Clara Luciani, 2023").place("La Creuse").artist(listeArtiste).max_tickets(35).price(600).start_at(dateEvent).end_at(dateEndEvent).sell_at(sellEvent).build());


		}

		if(discountRepository.count() == 0){
			discountRepository.save(Discount.builder().name("Happy Hour").code("000020").amount(20).build());
			discountRepository.save(Discount.builder().name("Half of It").code("000050").amount(50).build());
			discountRepository.save(Discount.builder().name("Simon Beddar").code("000010").amount(10).build());
		}

		if(productRepository.count() == 0)
		{
			productRepository.save(Product.builder().name("T-shirt des Rolling Stones").price(2000).build());
			productRepository.save(Product.builder().name("Lunettes de Gilbert Montagné").price(2000).build());
			productRepository.save(Product.builder().name("Casquette Fête de la musique Édition 2023").price(2000).build());
			productRepository.save(Product.builder().name("American performer mustang - Fender").price(2000).build());
			productRepository.save(Product.builder().name("Lot de vinyl années 80").price(2000).build());
			productRepository.save(Product.builder().name("Enceinte portable Bose SoundLink").price(2000).build());
		}

		if(artistRepository.count() == 0)
		{
			artistRepository.save(Artist.builder().firstName("Travis").lastName("Scott").build());
			artistRepository.save(Artist.builder().firstName("Jean-Jacques").lastName("Goldman").build());
			artistRepository.save(Artist.builder().firstName("Clara").lastName("Luciani").build());
			artistRepository.save(Artist.builder().firstName("Aya").lastName("Nakamura").build());
			artistRepository.save(Artist.builder().firstName("Julien").lastName("Doré").build());
		}

		if(userRepository.count() == 0)
		{
			userRepository.save(User.builder().firstname("Maxime").lastname("Baudoin").email("maxime.baudoin@epsi.fr").build());
			userRepository.save(User.builder().firstname("Hugo").lastname("Scarbonchi").email("hugo.scarbonchi@epsi.fr").build());
			userRepository.save(User.builder().firstname("Matis").lastname("Galvin").email("matis.galvin@epsi.fr").build());
			userRepository.save(User.builder().firstname("Antonin").lastname("Simon").email("antonin.simon@epsi.fr").build());
		}
	}
}
