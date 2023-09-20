package com.foody.member.dto.request;

public record MemberJoinRequest(
    String email,
    String nickname,
    float height,
    float weight,
    int gender,
    int age,
    int activityLevel
) {

}
