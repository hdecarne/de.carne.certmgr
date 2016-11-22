/*
 * Copyright (c) 2015-2016 Holger de Carne and contributors, All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.carne.certmgr.certs.signer;

import de.carne.certmgr.certs.ProviderMap;
import de.carne.certmgr.certs.spi.CertSigner;

/**
 * Utility class providing {@link CertSigner} related functions.
 */
public final class CertSigners {

	/**
	 * The registered {@link CertSigner}s.
	 */
	public static final ProviderMap<CertSigner> REGISTERED = new ProviderMap<>(CertSigner.class);

	/**
	 * The default {@link CertSigner}.
	 */
	public static final CertSigner DEFAULT = REGISTERED.get(LocalCertSigner.PROVIDER_NAME);

}
