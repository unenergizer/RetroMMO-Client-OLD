package com.retrommo.iocommon.wire.server;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/*********************************************************************************
 *
 * OWNER: Robert Andrew Brown
 * PROGRAMMER: Robert Andrew Brown
 * PROJECT: retrommo-server
 * DATE: 3/26/2017
 * _______________________________________________________________________________
 *
 * Copyright © 2017 Robert Andrew Brown. All Rights Reserved.
 *
 * No part of this project and/or code and/or source code and/or source may be 
 * reproduced, distributed, or transmitted in any form or by any means, 
 * including photocopying, recording, or other electronic or mechanical methods, 
 * without the prior written permission of the owner.
 */
@Getter
@Setter
public class AuthSuccess implements Serializable {
    private boolean loginSuccess = false;
    private boolean versionCheckPassed = false;
}
