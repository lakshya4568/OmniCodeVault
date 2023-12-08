linear:
(__TEXT,__text) section
__Z12linearSearchPiii:
0000000100003c78        sub     sp, sp, #0x20
0000000100003c7c        str     x0, [sp, #0x10]
0000000100003c80        str     w1, [sp, #0xc]
0000000100003c84        str     w2, [sp, #0x8]
0000000100003c88        str     wzr, [sp, #0x4]
0000000100003c8c        b       0x100003c90
0000000100003c90        ldr     w8, [sp, #0x4]
0000000100003c94        ldr     w9, [sp, #0xc]
0000000100003c98        subs    w8, w8, w9
0000000100003c9c        cset    w8, ge
0000000100003ca0        tbnz    w8, #0x0, 0x100003ce8
0000000100003ca4        b       0x100003ca8
0000000100003ca8        ldr     x8, [sp, #0x10]
0000000100003cac        ldrsw   x9, [sp, #0x4]
0000000100003cb0        ldr     w8, [x8, x9, lsl  #2]
0000000100003cb4        ldr     w9, [sp, #0x8]
0000000100003cb8        subs    w8, w8, w9
0000000100003cbc        cset    w8, ne
0000000100003cc0        tbnz    w8, #0x0, 0x100003cd4
0000000100003cc4        b       0x100003cc8
0000000100003cc8        ldr     w8, [sp, #0x4]
0000000100003ccc        str     w8, [sp, #0x1c]
0000000100003cd0        b       0x100003cf4
0000000100003cd4        b       0x100003cd8
0000000100003cd8        ldr     w8, [sp, #0x4]
0000000100003cdc        add     w8, w8, #0x1
0000000100003ce0        str     w8, [sp, #0x4]
0000000100003ce4        b       0x100003c90
0000000100003ce8        mov     w8, #-0x1
0000000100003cec        str     w8, [sp, #0x1c]
0000000100003cf0        b       0x100003cf4
0000000100003cf4        ldr     w0, [sp, #0x1c]
0000000100003cf8        add     sp, sp, #0x20
0000000100003cfc        ret

_main:
0000000100003d00        stp     x29, x30, [sp, #-0x10]!
0000000100003d04        mov     x29, sp
0000000100003d08        sub     sp, sp, #0x50
0000000100003d0c        adrp    x8, 1 ; 0x100004000
0000000100003d10        ldr     x8, [x8, #0x10] ; literal pool symbol address: ___stack_chk_guard
0000000100003d14        ldr     x8, [x8]
0000000100003d18        stur    x8, [x29, #-0x8]
0000000100003d1c        stur    wzr, [x29, #-0xc]
0000000100003d20        adrp    x0, 0 ; 0x100003000
0000000100003d24        add     x0, x0, #0xf04 ; literal pool for: "Enter the size of the array : "
0000000100003d28        bl      0x100003eec ; symbol stub for: _printf
0000000100003d2c        sub     sp, sp, #0x10
0000000100003d30        mov     x9, sp
0000000100003d34        sub     x8, x29, #0x10
0000000100003d38        str     x8, [x9]
0000000100003d3c        adrp    x0, 0 ; 0x100003000
0000000100003d40        add     x0, x0, #0xf23 ; literal pool for: "%d"
0000000100003d44        bl      0x100003ef8 ; symbol stub for: _scanf
0000000100003d48        add     sp, sp, #0x10
0000000100003d4c        ldur    w8, [x29, #-0x10]
0000000100003d50        mov     x9, sp
0000000100003d54        stur    x9, [x29, #-0x18]
0000000100003d58        lsl     x9, x8, #2
0000000100003d5c        add     x9, x9, #0xf
0000000100003d60        and     x9, x9, #0xfffffffffffffff0
0000000100003d64        stur    x9, [x29, #-0x40]
0000000100003d68        adrp    x16, 1 ; 0x100004000
0000000100003d6c        ldr     x16, [x16] ; literal pool symbol address: ___chkstk_darwin
0000000100003d70        blr     x16
0000000100003d74        ldur    x10, [x29, #-0x40]
0000000100003d78        mov     x9, sp
0000000100003d7c        subs    x9, x9, x10
0000000100003d80        mov     sp, x9
0000000100003d84        stur    x9, [x29, #-0x38]
0000000100003d88        stur    x8, [x29, #-0x20]
0000000100003d8c        stur    wzr, [x29, #-0x24]
0000000100003d90        b       0x100003d94
0000000100003d94        ldur    w8, [x29, #-0x24]
0000000100003d98        ldur    w9, [x29, #-0x10]
0000000100003d9c        subs    w8, w8, w9
0000000100003da0        cset    w8, ge
0000000100003da4        tbnz    w8, #0x0, 0x100003e0c
0000000100003da8        b       0x100003dac
0000000100003dac        ldur    w9, [x29, #-0x24]
0000000100003db0        mov     x8, x9
0000000100003db4        sub     sp, sp, #0x10
0000000100003db8        mov     x9, sp
0000000100003dbc        str     x8, [x9]
0000000100003dc0        adrp    x0, 0 ; 0x100003000
0000000100003dc4        add     x0, x0, #0xf26 ; literal pool for: "Enter %d element (index) : "
0000000100003dc8        bl      0x100003eec ; symbol stub for: _printf
0000000100003dcc        ldur    x8, [x29, #-0x38]
0000000100003dd0        add     sp, sp, #0x10
0000000100003dd4        ldursw  x9, [x29, #-0x24]
0000000100003dd8        add     x8, x8, x9, lsl #2
0000000100003ddc        sub     sp, sp, #0x10
0000000100003de0        mov     x9, sp
0000000100003de4        str     x8, [x9]
0000000100003de8        adrp    x0, 0 ; 0x100003000
0000000100003dec        add     x0, x0, #0xf23 ; literal pool for: "%d"
0000000100003df0        bl      0x100003ef8 ; symbol stub for: _scanf
0000000100003df4        add     sp, sp, #0x10
0000000100003df8        b       0x100003dfc
0000000100003dfc        ldur    w8, [x29, #-0x24]
0000000100003e00        add     w8, w8, #0x1
0000000100003e04        stur    w8, [x29, #-0x24]
0000000100003e08        b       0x100003d94
0000000100003e0c        adrp    x0, 0 ; 0x100003000
0000000100003e10        add     x0, x0, #0xf42 ; literal pool for: "Enter the key to found : "
0000000100003e14        bl      0x100003eec ; symbol stub for: _printf
0000000100003e18        sub     sp, sp, #0x10
0000000100003e1c        mov     x9, sp
0000000100003e20        sub     x8, x29, #0x28
0000000100003e24        str     x8, [x9]
0000000100003e28        adrp    x0, 0 ; 0x100003000
0000000100003e2c        add     x0, x0, #0xf23 ; literal pool for: "%d"
0000000100003e30        bl      0x100003ef8 ; symbol stub for: _scanf
0000000100003e34        ldur    x0, [x29, #-0x38]
0000000100003e38        add     sp, sp, #0x10
0000000100003e3c        ldur    w1, [x29, #-0x10]
0000000100003e40        ldur    w2, [x29, #-0x28]
0000000100003e44        bl      __Z12linearSearchPiii
0000000100003e48        stur    w0, [x29, #-0x2c]
0000000100003e4c        ldur    w8, [x29, #-0x2c]
0000000100003e50        adds    w8, w8, #0x1
0000000100003e54        cset    w8, ne
0000000100003e58        tbnz    w8, #0x0, 0x100003e70
0000000100003e5c        b       0x100003e60
0000000100003e60        adrp    x0, 0 ; 0x100003000
0000000100003e64        add     x0, x0, #0xf5c ; literal pool for: "This element is not found in the array\n"
0000000100003e68        bl      0x100003eec ; symbol stub for: _printf
0000000100003e6c        b       0x100003e98
0000000100003e70        ldur    w9, [x29, #-0x2c]
0000000100003e74        mov     x8, x9
0000000100003e78        sub     sp, sp, #0x10
0000000100003e7c        mov     x9, sp
0000000100003e80        str     x8, [x9]
0000000100003e84        adrp    x0, 0 ; 0x100003000
0000000100003e88        add     x0, x0, #0xf84 ; literal pool for: "The element is at index %d\n"
0000000100003e8c        bl      0x100003eec ; symbol stub for: _printf
0000000100003e90        add     sp, sp, #0x10
0000000100003e94        b       0x100003e98
0000000100003e98        stur    wzr, [x29, #-0xc]
0000000100003e9c        ldur    x8, [x29, #-0x18]
0000000100003ea0        mov     sp, x8
0000000100003ea4        ldur    w8, [x29, #-0xc]
0000000100003ea8        stur    w8, [x29, #-0x44]
0000000100003eac        ldur    x9, [x29, #-0x8]
0000000100003eb0        adrp    x8, 1 ; 0x100004000
0000000100003eb4        ldr     x8, [x8, #0x10] ; literal pool symbol address: ___stack_chk_guard
0000000100003eb8        ldr     x8, [x8]
0000000100003ebc        subs    x8, x8, x9
0000000100003ec0        cset    w8, eq
0000000100003ec4        tbnz    w8, #0x0, 0x100003ed0
0000000100003ec8        b       0x100003ecc
0000000100003ecc        bl      0x100003ee0 ; symbol stub for: ___stack_chk_fail
0000000100003ed0        ldur    w0, [x29, #-0x44]
0000000100003ed4        mov     sp, x29
0000000100003ed8        ldp     x29, x30, [sp], #0x10
0000000100003edc        ret