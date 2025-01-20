package Project.Human_Disease_Detection_and_Treatment_Plan_generation.disease_detection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DiseaseDetectionAndTreatmentPlanGeneration {
	
	@RequestMapping("disease-detection")
	public String diseaseDetection() {
		return "diseaseDetectionPage";
	}
	
	@RequestMapping("treatment-plan-generation")
	public String treatmentPlanGeneration() {
		return "treatmentPlanGenerationPage";
	}
	
	@RequestMapping("report-generation")
	public String reportGeneration() {
		return "reportGenerationPage";
	}
}
