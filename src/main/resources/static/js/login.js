
    $(document).ready(function() {
        var dhxWins = new dhtmlXWindows();
        dhxWins.attachViewportTo("winVP");
        var win = dhxWins.createWindow({
            id: 'loginWindow',
            x: 0,
            y: 0,
            width: 450,
            height: 300,
            center: true
        });
        win.setText('Авторизируйтесь');
        win.center();
        win.keepInViewport(true);
        win.setModal(true);
        win.denyResize();
        win.denyMove();
        win.denyPark();
        win.button('close').hide();
        win.button('park').hide();
        win.button('minmax1').hide();
        win.attachObject('loginDialog');
        $('.dhxwin_active').css('z-index', 107);
    /*    $('#loginForm').validate({
            rules: {
                username: 'required',
                password: 'required'
            },
            messages: {
                username: '<spring:message code="msg.username_required" text="username is required"/>',
                password: '<spring:message code="msg.password_required" text="password is required"/>'
            }
        });*/

        $('#username').focus();
    });
