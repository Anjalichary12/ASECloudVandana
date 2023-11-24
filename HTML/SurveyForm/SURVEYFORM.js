function submitForm() {
  const firstName = document.getElementById('firstName').value;
  const lastName = document.getElementById('lastName').value;
  const dob = document.getElementById('dob').value;
  const country = document.getElementById('country').value;
  const genderMale = document.getElementById('male').checked ? 'Male' : '';
  const genderFemale = document.getElementById('female').checked ? 'Female' : '';
  const profession = document.getElementById('profession').value;
  const email = document.getElementById('email').value;
  const mobile = document.getElementById('mobile').value;

  // Validation - check if all fields are filled
  if (firstName && lastName && dob && country && (genderMale || genderFemale) && profession && email && mobile) {
    const popupValues = document.getElementById('popupValues');
    popupValues.innerHTML = `
      <p>First Name: ${firstName}</p>
      <p>Last Name: ${lastName}</p>
      <p>Date of Birth: ${dob}</p>
      <p>Country: ${country}</p>
      <p>Gender: ${genderMale} ${genderFemale}</p>
      <p>Profession: ${profession}</p>
      <p>Email: ${email}</p>
      <p>Mobile Number: ${mobile}</p>
    `;
    document.getElementById('popup').style.display = 'block';
    document.getElementById('surveyForm').reset();
  } else {
    alert('Please fill in all the fields.');
  }
}

function resetForm() {
  document.getElementById('surveyForm').reset();
}

function closePopup() {
  document.getElementById('popup').style.display = 'none';
}
