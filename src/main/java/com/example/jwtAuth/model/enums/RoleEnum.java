package com.example.jwtAuth.model.enums;

import lombok.Getter;

@Getter
public enum RoleEnum {
  admin("admin"),
  user("user");

  private final String name;

  RoleEnum(String name) {
    this.name = name;
  }

}