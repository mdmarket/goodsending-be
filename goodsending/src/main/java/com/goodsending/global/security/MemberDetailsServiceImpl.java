package com.goodsending.global.security;

import com.goodsending.member.dto.MemberDetailsDto;
import com.goodsending.member.entity.Member;
import com.goodsending.member.repository.MemberRepository;
import java.lang.ProcessBuilder.Redirect;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberDetailsServiceImpl implements UserDetailsService {

  private final MemberRepository memberRepository;

  @Override
  public UserDetails loadUserByUsername(String email) {
    Member member = memberRepository.findByEmail(email)
        .orElseThrow(() -> new UsernameNotFoundException("Not Found " + email));

    return new MemberDetailsImpl(MemberDetailsDto.from(member));
  }
}
