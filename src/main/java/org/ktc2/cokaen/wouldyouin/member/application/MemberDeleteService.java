package org.ktc2.cokaen.wouldyouin.member.application;

import lombok.RequiredArgsConstructor;
import org.ktc2.cokaen.wouldyouin.auth.MemberIdentifier;
import org.ktc2.cokaen.wouldyouin.member.persist.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberDeleteService {

    private final MemberRepository memberRepository;
    private final HostService hostService;
    private final CuratorService curatorService;

    @Transactional
    public void deleteById(MemberIdentifier memberIdentifier) {
        //TODO: 멤버 타입에 따라 다른 엔티티가 삭제되게 처리 필요
        //memberRepository.delete(findMemberOrThrow(memberId));
    }
}
