/********************************************************************************
 * Copyright (c) 2019 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 ********************************************************************************/
package org.eclipse.glsp.api.action.kind;

import java.util.List;

import org.eclipse.glsp.api.action.Action;
import org.eclipse.glsp.api.markers.Marker;

public class SetMarkersAction extends Action {

   private List<Marker> markers;

   public SetMarkersAction() {
      super(Action.Kind.SET_MARKERS);
   }

   public SetMarkersAction(final List<Marker> markers) {
      this();
      this.markers = markers;
   }

   public List<Marker> getMarkers() { return markers; }

   public void setMarkers(final List<Marker> markers) { this.markers = markers; }
}
