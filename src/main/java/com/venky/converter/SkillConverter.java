package com.venky.converter;

import com.venky.dto.Skillsdto;
import com.venky.entity.Skills;

public class SkillConverter 
{
	public static Skills dtoToEntity(Skillsdto skilldto)
	{
		Skills skill = new Skills(skilldto.getSkillsName(), null);
		skill.setSkillId(skilldto.getSkillsId());
		return skill;
	}

	public static Skillsdto EntitytoDto(Skills skills)
	{
		return new Skillsdto(skills.getSkillId(), skills.getSkillName());
	}
}
