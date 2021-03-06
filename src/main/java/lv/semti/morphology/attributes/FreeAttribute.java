/*******************************************************************************
 * Copyright 2008, 2009, 2014 Institute of Mathematics and Computer Science, University of Latvia
 * Author: Pēteris Paikens
 * 
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * 
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 * 
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package lv.semti.morphology.attributes;

import java.io.IOException;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;

import org.w3c.dom.Node;
/**
 * 
 * @author Pēteris
 * Atribūti, kam atļauts jebkāds saturs
 *
 */

//TODO - vai šī klase vispār kaut ko dara?
class FreeAttribute extends Attribute {
	FreeAttribute (Node node) {
		super(node);
		if (!node.getNodeName().equalsIgnoreCase("FreeAttribute")) throw new Error("Node was '" + node.getNodeName() + "' but Attribute was expected.");
	}

	@Override
	protected void toXMLData(Writer straume) throws IOException {
		// nothing to do here		
	}

	@Override
	public boolean isAllowed(String value) {
		return true;
	}

	@Override
	public List<String> getAllowedValues(String language) {
		return null;
	}

	@Override
	protected String xmlTagName() {
		return "FreeAttribute";
	}
}
