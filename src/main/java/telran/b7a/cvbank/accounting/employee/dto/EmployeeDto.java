package telran.b7a.cvbank.accounting.employee.dto;

import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class EmployeeDto {
	String email;
	String firstName;
	String lastName;
	List<String> cv_id;
}
