package in.ashokit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;

@SpringBootApplication
public class Application 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext cntx=SpringApplication.run(Application.class, args);
		BookRepository repo=cntx.getBean(BookRepository.class);
		//System.out.println(repo.getClass().getName());
		/*Book b1=new Book();
		b1.setBookId(111);
		b1.setBookName("Spring boot");
		b1.setBookPrice(3000.00);
		repo.save(b1);
		System.out.println("Record is inserted..."); */
		System.out.println("Retrieve the records...");
		Optional<Book>findbyid=repo.findById(111);
		System.out.println(findbyid.get());
		
	}

}
