package com.hoangtien2k3.profileservice.mapper;

import com.hoangtien2k3.profileservice.dto.request.ProfileCreationRequest;
import com.hoangtien2k3.profileservice.dto.response.UserProfileResponse;
import com.hoangtien2k3.profileservice.entity.UserProfile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfile toUserProfile(ProfileCreationRequest profileCreationRequest);

    UserProfileResponse toUserProfileResponse(UserProfile userProfile);
}
