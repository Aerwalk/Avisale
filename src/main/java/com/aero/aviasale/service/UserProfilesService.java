package com.aero.aviasale.service;

import com.aero.aviasale.domain.json.ContactsJson;
import com.aero.aviasale.repository.UserProfilesRepository;
import com.aero.aviasale.domain.apiDto.req.SignUpDto;
import com.aero.aviasale.domain.entity.UserProfiles;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfilesService {

    private final UserProfilesRepository userProfilesRepository;
    private static final Logger logger = LoggerFactory.getLogger(UserProfilesService.class);

    @Autowired
    public UserProfilesService(UserProfilesRepository userProfilesRepository) {
        this.userProfilesRepository = userProfilesRepository;
    }

    public UserProfiles createUserProfile(SignUpDto signUpDto) {
        ObjectMapper objectMapper = new ObjectMapper();
        ContactsJson contactsJson = new ContactsJson();
        UserProfiles userProfiles = new UserProfiles();
        userProfiles.setBookings(null);
        contactsJson.setEmail(signUpDto.getEmail());
        contactsJson.setPhone(signUpDto.getPhoneNo());
        try {
            String contacts = objectMapper.writeValueAsString(contactsJson);
            userProfiles.setContactDataJsonb(contacts);
        } catch (JsonProcessingException e) {
            logger.error("ObjectMapper can't write value as string! User: " + contactsJson.getEmail(), e);
        }
        userProfiles.setFullName(signUpDto.getFullName());
        userProfiles.setPassengerId(signUpDto.getPassengerId());
        return userProfiles;
    }
}
