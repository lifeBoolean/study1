package kr.sha.std1.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.sha.std1.dto.MemberDto;


@Mapper
public interface MemberMapper {
	int insertMember(MemberDto vo);
	int updateMember(MemberDto vo);
	int deleteMember(MemberDto vo);
	MemberDto getMemberInfo(MemberDto vo);
}
