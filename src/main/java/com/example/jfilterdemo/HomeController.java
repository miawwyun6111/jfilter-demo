package com.example.jfilterdemo;

import com.jfilter.filter.FieldFilterSetting;
import java.time.LocalDate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@FieldFilterSetting(className = SampleDto.class, fields = {"sampleName", "sampleNo"})
	@GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public SampleDto getSimpleSampleDto() {
		return createSampleDto();
	}


	@FieldFilterSetting(className = SampleDto.class, fields = {"description", "imgSmall"})
	@GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
	public SampleDto getSampleDto() {
		return createSampleDto();
	}


	private SampleDto createSampleDto() {
		return
			SampleDto.builder()
			.id(1L)
			.description("DESCRIPTION")
			.longDesc("LONG DESCRIPTION")
			.imgLarge("/img/img1.png")
			.imgSmall("/img/img1.png")
			.sampleName("SAMPLE NAME")
			.sampleNo("SAMPLE NO")
			.regDate(LocalDate.now())
			.build();
	}

}
