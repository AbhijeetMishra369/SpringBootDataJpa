package in.ashokit.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book 
{
	@Id  //represent primary key of a table
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	

}
