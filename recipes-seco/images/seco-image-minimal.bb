# Copyright 2017-2018 SECO
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Minimal Seco Image to validate i.MX machines."
LICENSE = "MIT"

inherit core-image

## Select Image Features
IMAGE_FEATURES += " \
    splash \
    nfs-server \
	ssh-server-openssh \
    hwcodecs \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '', \
       bb.utils.contains('DISTRO_FEATURES',     'x11', 'x11-base x11-sato', \
                                                       '', d), d)} \
"

IMAGE_INSTALL += " \
	packagegroup-core-seco \
"

CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-core-full-cmdline \
    packagegroup-tools-bluetooth \
    packagegroup-fsl-tools-audio \
    packagegroup-fsl-tools-gpu \
    packagegroup-fsl-tools-gpu-external \
    packagegroup-fsl-gstreamer1.0 \
    packagegroup-fsl-gstreamer1.0-full \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'weston-init', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11 wayland', 'weston-xwayland xterm', '', d)} \
"

export IMAGE_BASENAME = "seco-image-minimal"
