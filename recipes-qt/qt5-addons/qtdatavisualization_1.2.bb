#############################################################################
##
## Copyright (C) 2014 Digia Plc and/or its subsidiary(-ies).
##
## This file is part of the Qt Enterprise Embedded Scripts of the Qt
## framework.
##
## $QT_BEGIN_LICENSE$
## Commercial License Usage Only
## Licensees holding valid commercial Qt license agreements with Digia
## with an appropriate addendum covering the Qt Enterprise Embedded Scripts,
## may use this file in accordance with the terms contained in said license
## agreement.
##
## For further information use the contact form at
## http://www.qt.io/contact-us.
##
##
## $QT_END_LICENSE$
##
#############################################################################

DESCRIPTION = "Qt Data Visualization"
LICENSE = "QtEnterprise"
LIC_FILES_CHKSUM = "file://src/datavisualization/global/qdatavisualizationglobal.h;md5=80b80e41be7c22f5b90fc96163b7d1bf;beginline=1;endline=17"

inherit qt5-module sdk-sources

SRC_URI = " \
    git://codereview.qt-project.org/qt/tqtc-qtdatavis3d;branch=${BRANCH};protocol=ssh;sdk-uri=EnterpriseAddOns/QtDataVisualization/1.2/Src \
    "

# v1.2.2
SRCREV = "25fa07daf70b8b00cd6832a9e180dfa517da4b8b"
BRANCH = "master"

S = "${WORKDIR}/git"

DEPENDS += "qtbase qtdeclarative qtmultimedia"
