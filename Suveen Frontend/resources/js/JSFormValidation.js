function validateForm() {
    var name = document.getElementById("name");
    var email = document.getElementById("email");
    var mobile = document.getElementById("mobile");
    var category = document.getElementById("category");
    var gender = document.getElementById("gender");
    var comment = document.getElementById("comments");

    if (name.value == "") {
        alert('Name field required...')
        name.focus();
        return false;
    }

    if (email.value.indexOf('@')==-1) {
        alert('Enter valid email, missing @...')
        email.focus();
        return false;
    }

    if (email.value.indexOf('.')==-1) {
        alert('Enter valid email, missing . ')
        email.focus();
        return false;
    }

    if (mobile.value == "") {
        alert('mobile field required...')
        mobile.focus();
        return false;
    }

    if (category.value == "") {
        alert('categorycategory field required...')
        category.focus();
        return false;
    }

    if (gender.value == "") {
        alert('gender field required...')
        gender.focus();
        return false;
    }

    if (comment.value == "") {
        alert('comment field required...')
        comment.focus();
        return false;
    }

    return true;
}
