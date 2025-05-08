package kr.sha.std1.service;

import org.springframework.stereotype.Service;

import kr.sha.std1.dto.MemberDto;
import kr.sha.std1.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class MemberService {
	private final MemberMapper memberMapper;
	
	public void insertMember(MemberDto vo) {
		log.info("MemberDto Service ========== : {}",vo);
		memberMapper.insertMember(vo);
	}
	
	public void updateMember(MemberDto vo) {
	    // 회원 정보 업데이트
	    memberMapper.updateMember(vo);
	}
	
	public int deleteMember(MemberDto vo) {
		return memberMapper.deleteMember(vo);
	}
	
	public MemberDto getMemberInfo(MemberDto vo) {
		return memberMapper.getMemberInfo(vo);
	}

}
