public class ContactManagement {
    
    public class Contact {
        private String name;
        private String phoneNumber;
        private String email;

        public Contact() {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getName() {
            return name;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return name + ": " + phoneNumber + ", "
        }

    }
}
