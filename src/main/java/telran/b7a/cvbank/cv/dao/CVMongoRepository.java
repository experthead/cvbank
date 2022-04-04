package telran.b7a.cvbank.cv.dao;

import java.util.Set;
import java.util.stream.Stream;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import telran.b7a.cvbank.cv.models.CV;

public interface CVMongoRepository extends MongoRepository<CV, String> {
	Stream<CV> findBycvIdIn(Set<String> cvsId);
	
	Stream<CV> findCVsBySalaryBetween(int minSalary, int maxSalary);
	
	@Query("{'skills': {'$in': ?0}}")
	Stream<CV> findCVsBySkills(Set<String> skills);
	
	@Query("{'position': /?0/}")
	Stream<CV> findCVsByPosition(String position);
}
