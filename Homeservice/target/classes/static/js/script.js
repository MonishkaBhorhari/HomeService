document.getElementById("signupForm").addEventListener("submit", async function(event) {
    event.preventDefault(); // Prevent form submission

    const name = document.getElementById("name").value;
    const lastName = document.getElementById("lastName").value;
    const email = document.getElementById("email").value;
    const phoneNo = document.getElementById("phoneNo").value;
    const password = document.getElementById("password").value;

    const signUpReqDto = {
        name: name,
        lastName: lastName,
        email: email,
        phoneNo: phoneNo,
        password: password
    };

    try {
        const response = await fetch("/company/sign-up", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(signUpReqDto)
        });

        const result = await response.json();

        if (response.ok) {
            document.getElementById("message").textContent = "Sign-up successful! Welcome, " + result.name + ".";
            document.getElementById("message").style.color = "green"; // Change message color to green on success
        } else {
            document.getElementById("message").textContent = result.message || "Error occurred. Please try again.";
            document.getElementById("message").style.color = "red"; // Keep message color red on error
        }
    } catch (error) {
        console.error("Error:", error);
        document.getElementById("message").textContent = "Error occurred. Please try again.";
        document.getElementById("message").style.color = "red"; // Keep message color red on error
    }
});
