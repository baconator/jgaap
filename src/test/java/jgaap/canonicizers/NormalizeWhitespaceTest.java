/*
 * JGAAP -- a graphical program for stylometric authorship attribution
 * Copyright (C) 2009,2011 by Patrick Juola
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * 
 */
package jgaap.canonicizers;

import static org.junit.Assert.*;

import java.util.Arrays;

import com.jgaap.canonicizers.NormalizeWhitespace;
import org.junit.Test;

/**
 * @author michael
 * 
 */
public class NormalizeWhitespaceTest {

	/**
	 * Test method for
	 * {@link com.jgaap.canonicizers.NormalizeWhitespace#process(char[])}
	 * .
	 */
	@Test
	public void testProcess() {
		char[] sample = { 'H', 'e', 'l', 'l', 'o', ' ', ' ', '\t', '\n', 'W',
				'o', 'r', 'l', 'd', '!', '\n' };
		char[] expected = { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l',
				'd', '!', ' ' };
		char[] test = new NormalizeWhitespace().process(sample);
		assertTrue(Arrays.equals(expected, test));
	}
}
