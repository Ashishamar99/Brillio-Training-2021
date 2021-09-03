package com.brillio.dto_jsp_demo;

public class AddBO {
	public void getAdd(AddDTO dto) throws Exception{
		dto.setNum3(dto.getNum1() + dto.getNum2());
	}
}
