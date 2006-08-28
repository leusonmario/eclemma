/*******************************************************************************
 * Copyright (c) 2006 Mountainminds GmbH & Co. KG
 * This software is provided under the terms of the Eclipse Public License v1.0
 * See http://www.eclipse.org/legal/epl-v10.html.
 *
 * $Id$
 ******************************************************************************/
package com.mountainminds.eclemma.internal.ui.launching;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

/**
 * TODO
 * 
 * @author  Marc R. Hoffmann
 * @version $Revision$
 */
public class JUnitPluginCoverageTabGroup extends AbstractCoverageTabGroup {

  public JUnitPluginCoverageTabGroup() throws CoreException {
    super("org.eclipse.pde.ui.JunitLaunchConfig");
  }
  
  protected ILaunchConfigurationTab createCoverageTab(ILaunchConfigurationDialog dialog, String mode) {
    return new CoverageTab(true);
  }

}
