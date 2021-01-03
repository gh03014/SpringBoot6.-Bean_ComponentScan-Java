package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    //MemberService가 필요하므로 스프링에서 MemberService를 주입해준다
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
