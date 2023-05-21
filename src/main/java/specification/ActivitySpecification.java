package specification;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.Predicate;
import javax.servlet.http.HttpServletRequest;

import org.springframework.data.jpa.domain.Specification;

import com.javainuse.cadre.entity.Activity;

public class ActivitySpecification {
	 public Specification<Activity> getActivity(HttpServletRequest request){
		 return (root, query, criteriaBuilder) -> {
	            List<Predicate> predicates = new ArrayList<>();
		 
	            if (request.getParameter("id") != null) {
	                predicates.add(criteriaBuilder.equal(root.get("id"), request.getParameter("id")));
	            }
	            if (request.getParameter("subCategoryId") != null) {
	                predicates.add(criteriaBuilder.equal(root.get("subCategoryId"), request.getParameter("subCategoryId")));
	            }
	            
	            if(request.getParameter("performanceOutcome")!= null && !request.getParameter("performanceOutcome").isEmpty()) {
	                predicates.add(criteriaBuilder.equal(root.get("performanceOutcome"), request.getParameter("performanceOutcome")));
	            }
	            if(request.getParameter("performanceOutcomeUnit")!= null && !request.getParameter("performanceOutcomeUnit").isEmpty()) {
	                predicates.add(criteriaBuilder.equal(root.get("performanceOutcomeUnit"), request.getParameter("performanceOutcomeUnit")));
	            }
	            if(request.getParameter("paymentOutcome")!= null && !request.getParameter("paymentOutcome").isEmpty()) {
	                predicates.add(criteriaBuilder.equal(root.get("paymentOutcome"), request.getParameter("paymentOutcome")));
	            }
	            if(request.getParameter("paymentOutcomeUnit")!= null && !request.getParameter("paymentOutcomeUnit").isEmpty()) {
	                predicates.add(criteriaBuilder.equal(root.get("paymentOutcomeUnit"), request.getParameter("paymentOutcomeUnit")));
	            }
	            if(request.getParameter("activityName")!= null && !request.getParameter("activityName").isEmpty()) {
	                predicates.add(criteriaBuilder.equal(root.get("activityName"), request.getParameter("activityName")));
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
	 
