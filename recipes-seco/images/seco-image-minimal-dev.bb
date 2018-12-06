# Copyright 2017-2018 SECO
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Minimal Seco Image to Develop on i.MX machines."
LICENSE = "MIT"

require recipes-seco/images/seco-image-minimal.bb

IMAGE_FEATURES += " \
	dbg-pkgs \
	dev-pkgs \
	debug-tweaks \
	tools-debug \
	tools-profile \
	tools-sdk \
	tools-testapps \
"


export IMAGE_BASENAME = "seco-image-minimal-dev"
