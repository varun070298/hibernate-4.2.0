/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2012, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */

//$Id$
package org.hibernate.test.naturalid.immutableentity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.NaturalIdCache;

/**
 * @author Eric Dalquist
 */
@Entity
@Immutable
@NaturalIdCache
public class Building {
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	@NaturalId
	private String address;
	@NaturalId
	private String city;
	@NaturalId
	private String state;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( ( address == null ) ? 0 : address.hashCode() );
		result = prime * result + ( ( city == null ) ? 0 : city.hashCode() );
		result = prime * result + ( ( state == null ) ? 0 : state.hashCode() );
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if ( this == obj )
			return true;
		if ( obj == null )
			return false;
		if ( getClass() != obj.getClass() )
			return false;
		Building other = (Building) obj;
		if ( address == null ) {
			if ( other.address != null )
				return false;
		}
		else if ( !address.equals( other.address ) )
			return false;
		if ( city == null ) {
			if ( other.city != null )
				return false;
		}
		else if ( !city.equals( other.city ) )
			return false;
		if ( state == null ) {
			if ( other.state != null )
				return false;
		}
		else if ( !state.equals( other.state ) )
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Building [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", state=" + state
				+ "]";
	}
	
}
