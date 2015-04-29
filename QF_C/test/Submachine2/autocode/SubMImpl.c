//-*- Mode: C++; -*-
//===========================================================================
// This software contains Caltech/JPL confidential information.
//
// Copyright 2009-2011, by the California Institute of Technology.
// ALL RIGHTS RESERVED. United States Government Sponsorship Acknowledged.
// Any commercial use must be negotiated with the Office of Technology
// Transfer at the California Institute of Technology.
//
// This software may be subject to US export control laws and
// regulations. By accepting this document, the user agrees to comply
// with all applicable U.S. export laws and regulations, including the
// International Traffic and Arms Regulations, 22 C.F.R. 120-130 and the
// Export Administration Regulations, 15 C.F.R. 730-744. User has the
// responsibility to obtain export licenses, or other export authority as
// may be required before exporting such information to foreign countries
// or providing access to foreign persons.
//===========================================================================
//
//       File: SubMImpl.cpp
// Created on: 09-Aug-2011 17:59:21
//     Author: scheng@jpl.nasa.gov
//
// This file was stubbed by the JPL StateChart Autocoders, which converts UML
// Statecharts, in XML, to a C++ variant of Miro Samek's Quantum Framework.
//===========================================================================
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <log_event.h>
#include <qf_port.h>
#include <qassert.h>
#include <SubMImpl.h>
#include <StatechartSignals.h>

SubMImpl* SubMImpl_Constructor (SubMImpl* mepl) {
    strcpy(mepl->machineName, "SubM");

    AttributeMapper_init(mepl);

    return mepl;
}

void SubMImpl_Destructor (SubMImpl* mepl) {
    AttributeMapper_clean(mepl);
}

void SubMImpl_setQActive (SubMImpl* mepl, QActive* active) {
    mepl->active = active;
}


////////////////////////////////////////////
// Action and guard implementation methods
////////////////////////////////////////////

void SubMImpl_takeAction (SubMImpl* mepl) {
    printf("%s.takeAction() default action implementation invoked\n", mepl->machineName);
}