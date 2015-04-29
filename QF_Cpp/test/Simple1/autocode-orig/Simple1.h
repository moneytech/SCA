/**
 * @file Simple1.h
 *
 * This file was generated by the SIM MagicDraw statechart converter 
 * which converts MagicDraw statecharts expressed in XML to Miro Samek's
 * C Quantum Framework.
 *
 * &copy; 2009-2010 Jet Propulsion Lab / California Institute of Technology
 */

#ifndef _simple1_h
#define _simple1_h

#include "qf_port.h"
#include "qassert.h"

#include "Simple1Impl.h"

/**
 * Enumerate all the states that the state machine may be in at
 * any given time.
 */
enum StateEnumSimple1 {
   SIMPLE1_S1, /* State = 0 */
   SIMPLE1_S2  /* State = 1 */
};

/**
 * Declare the state machine class, which encapsulates the
 * extended state variables the static member state-handler methods.
 * It also tracks any owned orthogonal regions and propagate events
 * to these regions.
 */
class Simple1 : public QActive {
private:
	char objName[256];
	Simple1Impl* impl;
	QActive *parent;
    bool isSubstate;
    enum StateEnumSimple1 myState;

public:
	/**
	 * State machine constructor and destructor
	 */
	Simple1 (const char *objNameNew, Simple1Impl *implObj, QActive *parent, bool isSubstate=0);
	virtual ~Simple1 ();

protected:
	/**
	 * Method to initialize state machine to the initial pseudostate
	 */
	static QState initial (Simple1 *me, QEvent const *e);

	/**
	 * Static state-handler methods
	 */
	static QState S1 (Simple1 *me, QEvent const *e);
	static QState S2 (Simple1 *me, QEvent const *e);
};

#endif /* _simple1_h */
