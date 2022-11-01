package dmacc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan({"dmacc.beans" , "dmacc.controller" })
public class WineInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WineInventoryApplication.class, args);
	}

}

//Notes
//Had huge issue getting this to work. Turns out I was just missing
//@Entity on the WineBottle.java. Once added
//the error "class not managed" dissapeared and it worked