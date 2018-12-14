package com.example.jfilterdemo;

import java.io.Serializable;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data @Builder @AllArgsConstructor
public class SampleDto implements Serializable {
	// 공통 필드
	private Long id;
	private String sampleName;
	private String sampleNo;
	private LocalDate regDate;
	private String imgSmall;
	private String description;
	private String longDesc;
	private String imgLarge;

}
