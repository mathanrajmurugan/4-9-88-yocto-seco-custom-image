# Provides the i.MX6 SECO common settings


require conf/machine/include/tune-cortexa9.inc
require conf/machine/include/seco-imx-base.inc

SERIAL_CONSOLE = "115200 ttymxc0"


MACHINEOVERRIDES =. "mx6:mx6qdl:"


PREFERRED_PROVIDER_u-boot = "u-boot-seco"
PREFERRED_PROVIDER_u-boot_mx6 = "u-boot-seco"
PREFERRED_PROVIDER_virtual/bootloader = "u-boot-seco"
PREFERRED_PROVIDER_virtual/bootloader_mx6 = "u-boot-seco"

UBOOT_MAKE_TARGET = "spl_imx"
UBOOT_SUFFIX = "imx"
SPL_BINARY = "SPL"


#PREFERRED_PROVIDER_virtual/kernel = "linux-seco"
#PREFERRED_PROVIDER_virtual/kernel_mx6 = "linux-seco"
#PREFERRED_PROVIDER_virtual/kernel_mx6qdl = "linux-seco"


KERNEL_IMAGETYPE = "zImage"


MACHINE_FEATURES += " pci wifi bluetooth usbhost usbgadget screen"


