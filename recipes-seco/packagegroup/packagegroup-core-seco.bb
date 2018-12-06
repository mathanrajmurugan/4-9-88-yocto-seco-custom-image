
DESCRIPTION = "Package group for base Seco FS"
LICENSE = "MIT"

inherit packagegroup


RDEPENDS_${PN} = " \
   	i2c-tools \
	openssh-sftp-server \
	iw \
	wpa-supplicant \
	vim \
	coreutils \
	cpufrequtils \
	procps \
"

