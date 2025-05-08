package kr.sha.std1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.sha.std1.dto.MemberDto;
import kr.sha.std1.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Controller
public class MemberController {
	private final MemberService memberService;
	
	@GetMapping("/member/write")
	public String memberWrite(Model model, MemberDto vo) {
		
		return "member/writeForm";
	}
	
	@GetMapping("/member/modify")
	public String memberModify(Model model, MemberDto vo) {
//		vo.setMemId("this");
//		MemberDto memberInfo = memberService.getMemberInfo(vo);
//		model.addAttribute("memberVo", memberInfo);
		
		model.addAttribute("memberVo", memberService.getMemberInfo(vo));
		
		return "member/writeForm";
	}
	
	@PostMapping("/member/process")
	public String memberProcess(Model model, MemberDto vo) {
		log.info("MemberDto {}", vo.toString());
		memberService.insertMember(vo);
//		if("".equals(vo.getMemId()) || vo.getMemId() == null) {
//			log.info("groupModifyForm 1~~~~~~~~~~~ {}", vo.toString());
//		} else {
//			log.info("groupModifyForm 2~~~~~~~~~~~ {}", vo.toString());
//			memberService.updateMember(vo);
//		}
//		String url = "";
//		url = "redirect:/admin/member/";
//		return url;
		return "member/result";
	}

}
