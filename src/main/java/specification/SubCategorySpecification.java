package specification;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.Predicate;
import javax.servlet.http.HttpServletRequest;

import org.springframework.data.jpa.domain.Specification;

import com.javainuse.cadre.entity.Activity;
import com.javainuse.cadre.entity.SubCategory;

public class SubCategorySpecification {
	public Specification<SubCategory> getSubCategory(HttpServletRequest request){
		 return (root, query, criteriaBuilder) -> {
	            List<Predicate> predicates = new ArrayList<>();
		 
	            if (request.getParameter("id") != null) {
	                predicates.add(criteriaBuilder.equal(root.get("id"), request.getParameter("id")));
	            }
	            if (request.getParameter("categoryId") != null) {
	                predicates.add(criteriaBuilder.equal(root.get("categoryId"), request.getParameter("categoryId")));
	            }
	            
	            if(request.getParameter("subCategoryName")!= null && !request.getParameter("subCategoryName").isEmpty()) {
	                predicates.add(criteriaBuilder.equal(root.get("subCategoryName"), request.getParameter("subCategoryName")));
	            }
	            if(request.getParameter("status")!= null && !request.getParameter("status").isEmpty()) {
	                predicates.add(criteriaBuilder.equal(root.get("status"), request.getParameter("status")));
	            }
	           
	            predicates.add(criteriaBuilder.equal(root.get("isDeleted"), "1"));
	            query.orderBy(criteriaBuilder.desc(root.get("id")));
	            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
		 };
		 }	 
}
