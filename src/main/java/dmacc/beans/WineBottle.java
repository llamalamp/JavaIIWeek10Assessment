package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
public class WineBottle {
	@Id
	@GeneratedValue private long id;
	 private String brand;
	 private String varietal;
	 private int yearBottled;
	 private int yearsToAge;

}
