/*
 * Copyright (c) 2010-2016 Osman Shoukry
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.openpojo.utils.dummypackage;

import java.io.Serializable;
import java.sql.Timestamp;

import com.openpojo.business.annotation.BusinessKey;

public final class Person implements Serializable, Persistable {

  private static final long serialVersionUID = 1L;

  @BusinessKey(composite = true, caseSensitive = false)
  private String firstname;

  @BusinessKey(composite = true, caseSensitive = false)
  private String middlename;

  @BusinessKey(caseSensitive = false)
  private String lastname;

  @BusinessKey(required = false, caseSensitive = true)
  private String password;

  private Timestamp created;
  private Timestamp lastupdated;

  /**
   * Default constructor for persistence service loading.
   */
  public Person() {
  }

  /**
   * Full constructor.
   */
  public Person(final String id, final String firstname, final String middlename, final String lastname, final String password,
                final Timestamp created, final Timestamp lastupdated) {
    this.id = id;
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.password = password;
    this.created = created;
    this.lastupdated = lastupdated;
  }

  /**
   * Minimal business constructor.
   */
  public Person(final String firstname, final String middlename, final String lastname) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
  }

  private String id;

  public String getId() {
    return id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  /**
   * @return the firstname
   */
  public String getFirstname() {
    return firstname;
  }

  /**
   * @param firstname
   *     the firstname to set
   */
  public void setFirstname(final String firstname) {
    this.firstname = firstname;
  }

  /**
   * @return the middlename
   */
  public String getMiddlename() {
    return middlename;
  }

  /**
   * @param middlename
   *     the middlename to set
   */
  public void setMiddlename(final String middlename) {
    this.middlename = middlename;
  }

  /**
   * @return the lastname
   */
  public String getLastname() {
    return lastname;
  }

  /**
   * @param lastname
   *     the lastname to set
   */
  public void setLastname(final String lastname) {
    this.lastname = lastname;
  }

  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * @param password
   *     the password to set
   */
  public void setPassword(final String password) {
    this.password = password;
  }

  public Timestamp getCreated() {
    return created;
  }

  public void setCreated(final Timestamp created) {
    this.created = created;
  }

  public Timestamp getLastupdated() {
    return lastupdated;
  }

  public void setLastupdated(final Timestamp lastupdated) {
    this.lastupdated = lastupdated;
  }

  @Override
  public String toString() {
    return String.format("Person [id=%s, firstname=%s, middlename=%s, lastname=%s, created=%s, lastupdated=%s]",
        getId(), firstname, middlename, lastname, created, lastupdated);
  }
}
