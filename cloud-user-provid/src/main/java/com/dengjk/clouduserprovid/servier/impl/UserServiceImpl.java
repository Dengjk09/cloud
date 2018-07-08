package com.dengjk.clouduserprovid.servier.impl;

import com.dengjk.clouduserprovid.dao.UserRepository;
import com.dengjk.clouduserprovid.entity.UserEntity;
import com.dengjk.clouduserprovid.servier.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity getUserById(Integer id ){
        Pageable page =new PageRequest(0,10, Sort.Direction.ASC,"id");
        UserEntity userEntity = userRepository.findById(id).orElse(null);
        return userEntity;
    }

}
