/*
* Copyright (c) 2024 Contributors to the Eclipse Foundation.
*
* This program and the accompanying materials are made
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
*
* Contributors:
*   Stefan Bischof (bipolis.org) - initial
*/
package org.eclipse.daanse.report.pdf.assertion.core;

import org.apache.pdfbox.pdmodel.PDPage;
import org.eclipse.daanse.report.pdf.assertion.api.model.PDFPage;
import org.eclipse.daanse.report.pdf.assertion.api.model.PDFPageArea;
import org.eclipse.daanse.report.pdf.assertion.api.model.PDFPoint;

public class PDFPageImpl extends PDFPageAreaImpl implements PDFPage {

    public PDFPageImpl(PDPage page) {
        super(page);
    }

    @Override
    public PDFPageArea getPageArea(PDFPoint upperLeft, PDFPoint lowerRight) {
        // TODO Auto-generated method stub
        return null;
    }



}
