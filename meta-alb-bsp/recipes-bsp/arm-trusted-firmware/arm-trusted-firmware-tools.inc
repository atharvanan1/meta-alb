# Copyright 2022, 2024 NXP

DESCRIPTION = "ARM Trusted Firmware Tools"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://license.rst;md5=1dd070c98a281d18d9eefd938729b031"

BBCLASSEXTEND = "native"
DEPENDS += "openssl-native"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

EXTRA_OEMAKE += 'HOSTCC="${BUILD_CC} ${BUILD_CPPFLAGS} ${BUILD_CFLAGS} ${BUILD_LDFLAGS}"'
EXTRA_OEMAKE += 'OPENSSL_DIR="${STAGING_LIBDIR_NATIVE}/../"'

do_compile() {
	oe_runmake -C "${S}" fiptool
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${S}/tools/fiptool/fiptool ${D}/${bindir}/
}

FILES:${PN} = "${bindir}/fiptool"
