package org.linphone.tester;

/*
 LinphoneTest.java
 Copyright (C) 2018  Belledonne Communications, Grenoble, France

 This program is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License
 as published by the Free Software Foundation; either version 2
 of the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

import junit.framework.TestCase;

import org.junit.Assert;

public class LinphoneTest extends TestCase {
    private String mSuite, mTest;
    private String mResult;

    public LinphoneTest(String suite, String test) {
        mSuite = suite;
        mTest = test;
        setName(suite + "/" + test);
    }

    @Override
    public void runTest() {
        mResult = Tester.getInstance().runTestInSuite(mSuite, mTest);
        if (mResult != null) {
            Assert.fail(mResult);
        }
    }
}
