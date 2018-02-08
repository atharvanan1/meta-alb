SUMMARY = "extend packagegroup for fsl SDK"
LICENSE = "MIT"

inherit packagegroup

PROVIDES = "${PACKAGES}"

PACKAGES = "\
    packagegroup-fsl-extend \
    ${@bb.utils.contains('DISTRO_FEATURES', 'perl', 'packagegroup-fsl-extend-perl', '',d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'python', 'packagegroup-fsl-extend-python', '',d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'usbhost', 'packagegroup-fsl-extend-usbhost', '',d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'virtualization', 'packagegroup-fsl-extend-virtualization', '',d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'db', 'packagegroup-fsl-extend-db', '',d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'benchmark', 'packagegroup-fsl-extend-benchmark', '',d)} \
    packagegroup-fsl-extend-misc \
"

RDEPENDS_packagegroup-fsl-extend = "\
    ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'packagegroup-fsl-extend-alsa', '',d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'perl', 'packagegroup-fsl-extend-perl', '',d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'ppp', 'packagegroup-fsl-extend-ppp', '',d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'python', 'packagegroup-fsl-extend-python', '',d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'usbhost', 'packagegroup-fsl-extend-usbhost', '',d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'virtualization', 'packagegroup-fsl-extend-virtualization', '',d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'db', 'packagegroup-fsl-extend-db', '',d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'benchmark', 'packagegroup-fsl-extend-benchmark', '',d)} \
    packagegroup-fsl-extend-misc \
"

RDEPENDS_packagegroup-fsl-extend-alsa = "\
    alsa-utils \
"

RDEPENDS_packagegroup-fsl-extend-perl = "\
    perl \
    perl-misc \
    perl-modules \
    perl-module-re \
    perl-pod \
"

RDEPENDS_packagegroup-fsl-extend-ppp = "\
    ppp \
    ppp-dialin \
"

RDEPENDS_packagegroup-fsl-extend-python = "\
    python \
    python-misc \
    python-modules \
"

RDEPENDS_packagegroup-fsl-extend-usbhost = "\
    usbutils \
"

RDEPENDS_packagegroup-fsl-extend-virtualization += "\
    qemu \
"

RDEPENDS_packagegroup-fsl-extend-db = "\
    db \
    sqlite3 \
"

RDEPENDS_packagegroup-fsl-extend-misc = "\
    bind \
    bison \
    ccache \
    chkconfig \
    curl \
    dhcp-client \
    diffstat \
    dtc \
    gettext-runtime \
    git \
    intltool \
    lsb \
    lsbinitscripts \
    lsbtest \
    lsof \
    man \
    man-pages \
    mdadm \
    oprofile \
    parted \
    perf \
    quilt \
    rpm \
    rt-tests \
    subversion \
    tcl \
    u-boot-mkimage \
    unzip \
    watchdog \
    which \
    xinetd \
    xz  \
    zip \
    chrpath \
    git-perltools \
    texinfo \
"

RRECOMMENDS_packagegroup-fsl-extend-misc = "\
    debianutils \
    libnfnetlink \
    ptpd \
    rng-tools \
    rp-pppoe \
    samba \
    wget \
"

RDEPENDS_packagegroup-fsl-extend-benchmark = "\
"

RRECOMMENDS_packagegroup-fsl-extend-benchmark = "\
    bonnie++ \
    dbench \
    tiobench \
"
