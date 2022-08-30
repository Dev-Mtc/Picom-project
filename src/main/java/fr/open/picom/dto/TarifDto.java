package fr.open.picom.dto;



import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.OneToOne;
=======
import javax.validation.constraints.NotBlank;
>>>>>>> e671430 (Updating some files)

import io.micrometer.core.lang.NonNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@Data
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class TarifDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

<<<<<<< HEAD
	//@NotBlank(message = "Merci de préciser le prix en euros")
=======
	@NonNull
	@NotBlank(message = "Merci de préciser le prix en euros")
>>>>>>> e671430 (Updating some files)
	private double prixEnEuros;

	@NonNull
	private Long zoneId;
	
	@NonNull
	private Long trancheHoraireId;


	
}
